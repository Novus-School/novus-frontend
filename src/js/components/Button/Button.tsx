import React from 'react'

const ButtonComponent = (props) => {
    return (
        <button style={{backgroundColor: "green"}}>
            {props.title}
        </button>
    )
}

export { ButtonComponent as Button };