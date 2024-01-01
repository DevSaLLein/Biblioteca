import { useState } from 'react';

import {Link, useNavigate,} from 'react-router-dom';
import {RiMovie2Line} from 'react-icons/ri'
import {BiSearchAlt2} from 'react-icons/bi'

import './style.css'
const NavBar = () => {

  const[search, setSearch] = useState('');
  const nagivate = useNavigate();

  const handleSubmit = (Event) => {
    Event.preventDefault();

    if(!search) return

    nagivate(`/search?q=${search}`);
    setSearch('');
  }

  return (
    <>
        <nav className="nav__container">
            <Link to='/'> <RiMovie2Line/> SOP-CE : Movies </Link>

            <form onSubmit={handleSubmit}>
                <input 
                  type="text" 
                  placeholder='Busque um filme' 
                  onChange={(Event) => setSearch(Event.target.value)} 
                  value={search}
                />

                <button type="submit"> <BiSearchAlt2/></button>
            </form>
        </nav>
    </>
  )
}

export default NavBar