import Hello from "./Hello";
import Wrapper from "./Wrapper";
import UserCard from "./UserCard";
import './App.css';

function App() {
  return (
    // <Wrapper>
    // <Hello name="props" color="red" isSpecial={true}/>
    // <Hello color="pink"/>
    // <Hello name="abc" color="blue" isSpecial/>
    // </Wrapper>

    <UserCard name="Alice" age={30} location="NY">

    </UserCard>
  );
}

export default App;
