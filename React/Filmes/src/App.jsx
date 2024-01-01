import NavBar from './components/NavBar';
import './App.css';
import { Outlet } from 'react-router-dom';

function App() {

  return (
    <div className='app__container'>
      <NavBar/>
      <Outlet/>
    </div>
  )
}

export default App
