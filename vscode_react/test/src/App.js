
import './App.css';
import React, { useRef, useState } from 'react';
import UserList1 from './UserList1';
import CreateUser from './CreateUser';

function App(){

  const [inputs, setInputs] = useState({
    username : '',
    email : '',
  });
  const{username, email} = inputs;
  const onChange = (e) => {
    const {name, value} = e.target;
    setInputs({
      ...inputs,
      [name] : value,
    });
  }

  const [users, setUsers] = useState ([
    {
        id: 1,
        username: 'velopert',
        email: 'a111@gmail.com'
      },
      {
        id: 2,
        username: 'tester',
        email: 'b222@gmail.com'
      },
      {
        id: 3,
        username: 'liz',
        email: 'c333@gmail.com'
      }
]);

const nextId = useRef(4);
const onCreate = () => {
  const users = {
    id : nextId.current,
    username,
    email,
  }
  setUsers([...users]);

  setInputs({
    username : '',
    email : '',
  });
  nextId.current += 1;
};
  
  return( 
    <>
      <CreateUser 
      username = {username}
      email = {email}
      onChange = {onChange}
      onCreate = {onCreate}
      />
      <UserList1 users={users}
      />
    </>
  );

}
export default App;