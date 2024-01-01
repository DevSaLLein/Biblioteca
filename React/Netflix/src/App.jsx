import { useEffect, useState } from 'react'

import query from './api/query'

import MovieList from './componentes/MovieList';
import Destaque from './componentes/Destaque';
import Header from './componentes/Header';

import './App.css'

function App() {

  const[movieList, setMovieList] = useState([]);
  const[destaque, setDestaque] = useState(null);
  const[blackHeader, setBlackHeader] = useState(false);

  useEffect(() => {

    const loadAll = async () => {

      let list = await query.getHomeList();
      setMovieList(list);

      let originals = list.filter(item => item.slug === "originals");

      let randomChoosen = Math.floor(Math.random() * (originals[0].items.results.length - 1))
      let choosen = originals[0].items.results[randomChoosen];
      let choosenInformations = await query.GetMovieInformations(choosen.id, 'tv');

      setDestaque(choosenInformations);

    }

    loadAll();
  }, []);

  useEffect(() => {

    const scrollListener = () => {
      
      if(window.screenY > 20) setBlackHeader(true); 
      else setBlackHeader(false);
    }

    window.addEventListener('scroll', scrollListener);

    return () => window.removeEventListener('scroll', scrollListener);
  }, [])

  return (
    <div className='page'>

      <Header black={blackHeader}/>
      
      {destaque && <Destaque item={destaque}/>}
      
      <section className="lists">
        { movieList.map((item, key) => <MovieList key={key} title={item.title} items={item.items}/>) }
      </section>
    </div>
  )
}

export default App
