import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from "pages/Listing/listing";
import Form from "pages/Form/form";
import Navbar from "./src/../components/Navbar/Navbar";

function App() {
  return (
    <BrowserRouter>
      <Navbar/>
      <Routes>
        <Route path="/" element={<Listing/>}/>
        <Route path="/form">
          <Route path=":movieId" element={<Form/>}/>
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
