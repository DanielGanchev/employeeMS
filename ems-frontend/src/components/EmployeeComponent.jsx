import React,{useState} from 'react'
import { addEmployee } from '../services/EmployeeService'
import { useNavigate } from 'react-router-dom'

const EmployeeComponent = () => {
  const [firstName, setFirstName] = useState('')
  const [lastName, setLastName] = useState('')
  const [email, setEmail] = useState('')

  const [errors, setErrors] = useState({
    firstName: '',
    lastName: '',
    email: ''
  })

  const navigate = useNavigate();

  const saveEmployee = (e) => {
    e.preventDefault()
    if (validate()) {
      const employee = { firstName: firstName, lastName: lastName, email: email }

    addEmployee(employee).then((response) => {
      console.log(response.data)
      navigate('/employees')
    }).catch((error) => {
      console.error(error)
    })
    }

}

function validate() {
  let errors = {}
  let isValid = true
  if (!firstName) {
    isValid = false
    errors['firstName'] = 'Please enter first name.'
  }
  if (!lastName) {
    isValid = false
    errors['lastName'] = 'Please enter last name.'
  }
  if (!email) {
    isValid = false
    errors['email'] = 'Please enter email address.'
  }
  if (typeof email !== 'undefined') {
    let lastAtPos = email.lastIndexOf('@')
    let lastDotPos = email.lastIndexOf('.')

    if (!(lastAtPos < lastDotPos && email.indexOf('@') > 0 && lastDotPos > 2 && email.length - lastDotPos > 2)) {
      isValid = false
      errors['email'] = 'Email is not valid.'
    }
  }
  setErrors(errors)
  return isValid
}

  return (
    <div className="container">
      <br/>
      <br/>
      <div className="row">
        <div className="card col-md-6 offset-md-3 offset-md-3 ">
          <h2 className="text-center">Add Employee</h2>
          <div className="card-body">
            <form>
              <div className="form-group mb-2">
                <label>First Name:</label>
                <input
                  type="text"
                  placeholder="First Name"
                  name="firstName"
                  className={errors.firstName ? 'form-control is-invalid' : 'form-control'}
                  value={firstName}

                  onChange={(e) => setFirstName(e.target.value)}
                />
                {errors.firstName && <div className="text-danger">{errors.firstName}</div>}
              </div>
              <div className="form-group mb-2">
                <label>Last Name:</label>
                <input
                  type="text"
                  placeholder="Last Name"
                  name="lastName"
                  className={errors.lastName ? 'form-control is-invalid' : 'form-control'}
                  value={lastName}

                  onChange={(e) => setLastName(e.target.value)}
                />
                {errors.lastName && <div className="text-danger">{errors.lastName}</div>}
              </div>
              <div className="form-group mb-2">
                <label>Email:</label>
                <input
                  type="text"
                  placeholder="Email"
                  name="email"
                  className={errors.email ? 'form-control is-invalid' : 'form-control'}
                  value={email}

                  onChange={(e) => setEmail(e.target.value)}
                />
                {errors.email && <div className="text-danger">{errors.email}</div>}
              </div>
              <button className="btn btn-success" onClick={saveEmployee}>
                Save
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default EmployeeComponent
