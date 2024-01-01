import './style.css'

const Destaque = (movie = false) => {

    let firstDate = new Date(movie.first_air_date);
    let genres = [];

    movie.genres.forEach(genre => {
        genres.push(genre);
    });

    return (
        <section 
            className='destaque'
            style={{
                backgroundSize: 'cover',
                backgroundPosition: 'center',
                backgroundImage: `url(https://image.tmdb.org/t/p/original${movie.backdrop_path})`
            }}
        >

            <div className="vertical"></div>
            <div className="horizontal">
                <div className='title'>{movie.original_name}</div>
                <div className='informations'>
                    <div className="points">
                        {movie.vote_average} pontos
                    </div>
                    <div className="year">
                        {firstDate.getFullYear()}
                    </div>
                    <div className="seasons">
                        {movie.number_of_seasons} temporada {movie.number_of_seasons.length !== 1 ? 's': ''}
                    </div>
                </div>

                <div className="description">
                    {movie.overview}
                </div>

                <div className="buttons__container">                    
                    <a id='watchButton' href={`/watch/${movie.id}`}>Assistir</a>
                    <a id='listButton' href={`/list/add/${movie.id}`}>+ Minha Lista</a>
                </div>

                <div className="genres">
                    <strong>Gêneros: {genres.join(', ')}</strong>
                </div>
            </div>

        </section>
    )
}

export default Destaque