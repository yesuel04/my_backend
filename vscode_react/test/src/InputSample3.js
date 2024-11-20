import { useState, useRef } from "react";

function InputSample3(){
    const [inputs, setInputs] = useState({
        name : '',
        nickname : '',
        email : '',
    });

    const nameInput = useRef();

    const{name, nickname, email} = inputs;

    const onChange=(e)=>{
        const {value, name} = e.target; // e.target

        setInputs({
            ...inputs, //기존의 값을 불러오는 역할
            [name] : value,
        });
    }
    const onReset =(e)=>{
        setInputs({
            name : '',
            nickname : '',
            email : '',
        });
        nameInput.current.focus();
    }

    return(
        <div>
            <input name="name" placeholder="이름" onChange={onChange} value={name} ref={nameInput}></input>
            <input name="nickname" placeholder="닉네임" onChange={onChange} value={nickname}></input>
            <input name="email" placeholder="이메일" onChange={onChange} value={email}></input>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값 : </b>
                {name}({nickname}) - {email}
            </div>
        </div>
    );
}
export default InputSample3;