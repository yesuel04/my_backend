import { useState } from "react";

function InputSample(){
    const[Inputs, setInputs] = useState({
        name : '',
        nickname : '',
        email : '',
    });
    const {name, nickname, email} = Inputs; //비구조화 할당을 통해 값 추출.
    const onChange = (e) => { //키보드를 사용하여 입력 삭제 됐을 때
        const {value, name} = e.target;
        // console.log(e.target.value);
        // console.log(e.target.name);
        setInputs({
            ...Inputs,
            [name] : value, // name(name or nickname) 값
        });
    }
    const onReset = (e) => {
        setInputs({
            name : '',
            nickname : '',
            email : '',
        });
    }
    return(
        <div>
            <input placeholder="이름" name="name" onChange={onChange} value={name}/>
            <input placeholder="닉네임" name="nickname" onChange={onChange} value={nickname}/>
            <input placeholder="이메일" name="email" onChange={onChange} value={email}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>입력 값 : </b>
                {name} ({nickname}) - 이메일 : {email}
            </div>
        </div>
    );
}

export default InputSample;