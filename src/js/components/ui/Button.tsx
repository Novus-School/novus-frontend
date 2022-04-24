import React from 'react'

const ButtonComponent = (props) => {
    return (
        <button style={{backgroundColor: "orange"}}>
            {props.title}
        </button>
    )
}

export { ButtonComponent as Button };
