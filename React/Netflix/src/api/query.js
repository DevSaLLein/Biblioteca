const KEY = import.meta.env.VITE_API_KEY;
const API  = import.meta.env.VITE_API;

const query = async (query) => {

    const requisicao = await fetch(`${API}${query}&api_key=${KEY}`);
    const response = await requisicao.json();
    return response;
}

export default {
    getHomeList: async () => {
        return [
            {
                slug: 'originals',
                title: 'Originais da Netflix',
                items: await query(`/discover/tv?with_network=213`)
            },

            {
                slug: 'trending',
                title: 'Recomendados',
                items: await query(`/trending/all/week?`)
            },

            {
                slug: 'toprated',
                title: 'Em alta',
                items: await query(`/movie/top_rated`)
            },

            {
                slug: 'action',
                title: 'Ação',
                items: await query(`/discover/movie?with_genres=28`)
            },

            {
                slug: 'comedy',
                title: 'Comédia',
                items: await query(`/discover/movie?with_genres=35`)
            },

            {
                slug: 'horror',
                title: 'Terror',
                items: await query(`/discover/movie?with_genres=27`)
            },

            {
                slug: 'romance',
                title: 'Romance',
                items: await query(`/discover/movie?with_genres=1079`)
            },

            {
                slug: 'documentary',
                title: 'Documentários',
                items: await query(`/discover/movie?with_genres=99`)
            }
        ]
    },

    GetMovieInformations: async (movieId, type) => {
        
        let info = {};

        if(movieId){
            switch(type){
                case 'movie':
                    info = await query(`/movie/${movieId}`);
                break;

                case 'tv':
                    info = await query(`/tv/${movieId}`);
                break;

                default:
                    info = null;
                break;
            }
        }

        return info;

    }
}