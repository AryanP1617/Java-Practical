const submit=document.querySelector('#submit-button')
const display=document.querySelector('#view-button')
let arr=[]
let i=0

submit.addEventListener('click',()=>
{
    let name=window.prompt("Enter your name: ")
    let id=Number(window.prompt("Enter your roll number: "))
    let score=Number(window.prompt("Enter your score: "))

    let grade=null

    if (score >= 81) {
        grade = "A";
    } else if (score >= 61) {
        grade = "B";
    } else if (score >= 41) {
        grade = "C";
    } else {
        grade = "F";
    }


    let students=new Object()
    students.name=name
    students.id=id
    students.score=score
    students.grade=grade

    arr[i++]=students;
    
})

i=0

display.addEventListener('click',(e)=>
{
    arr.forEach(student=>
    {
        window.alert(`Name:${student.name}\nRoll no:${student.id}\nScore:${student.score}\nGrade:${student.grade}`)
    })
    
})