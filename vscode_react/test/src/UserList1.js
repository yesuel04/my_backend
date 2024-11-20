function User({user}){
    return(
        <div>
            <b>{user.username}</b><span>({user.email})</span>
        </div>
    );
};

function UserList1({users}){

    // const users = [
    //     {
    //         id: 1,
    //         username: 'velopert',
    //         email: 'a111@gmail.com'
    //       },
    //       {
    //         id: 2,
    //         username: 'tester',
    //         email: 'b222@gmail.com'
    //       },
    //       {
    //         id: 3,
    //         username: 'liz',
    //         email: 'c333@gmail.com'
    //       }
    // ];

    // const nextId = useRdf(4);

    // return(
    //     <div>
    //         <div>
    //             <b>{users[0].username}</b><span>({users[0].email})</span>
    //         </div>
    //         <div>
    //             <b>{users[1].username}</b><span>({users[1].email})</span>
    //         </div>
    //         <div>
    //             <b>{users[2].username}</b><span>({users[2].email})</span>
    //         </div>

    //     </div>
    // );

    // return(
    //     <div>
    //         <User user = {users[0]}/>
    //         <User user = {users[1]}/>
    //         <User user = {users[2]}/>
    //     </div>
    // );

    return(
        <div>
            {users.map(user => (
                <User user = {user} key={user.id}/>
            ))}
        </div>
    );
}
export default UserList1;