const ROOT_URL = `http://localhost:8080/v1`

export const StudentService = {
  browse: async () => {
    const students = await fetch(`${ROOT_URL}/students`)
    return students.json()
  }
}
