import { useState, useEffect } from "react"
import { useSearchParams } from "react-router-dom";

import MovieCard from "../components/MovieCard";

import './style.css'

const searchUrl = import.meta.env.VITE_SEARCH;
const apiKey = import.meta.env.VITE_API_KEY;

const  Search = ()  => {

  const [searchParams] = useSearchParams();
  const[topMovies, setMovies] = useState([]);

  const query = searchParams.get('q');

  const getSearchMovies = async (url) => {

    const response = await fetch(url)
    const data = await response.json();

    setMovies(data.results);
  }

  
  useEffect(() => {
    const searchWithQueryURL = `${searchUrl}?${apiKey}&query=${query}`;

    getSearchMovies(searchWithQueryURL)
    
  }, [query])


  return (
    <div className="container">
      <h2 className="title"> Resultados para: <span className="queryText">{query}</span></h2>

      <div className="movies__container">
        {topMovies.length === 0 && <p>Carregando...</p>}
        {topMovies && topMovies.map(movie => <MovieCard key={movie.id} movie={movie}/>)}
      </div>  
    </div>
  )
}

export default Search