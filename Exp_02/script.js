const button=document.querySelector('#submit')

button.addEventListener('click',(e)=>
{
    e.preventDefault();
    let marks1=Number(document.querySelector('#marks1').value)
    let marks2=Number(document.querySelector('#marks2').value)
    let marks3=Number(document.querySelector('#marks3').value)

    let percentage=((marks1+marks2+marks3)/60)*100

    const newtext=document.createElement('div')
    newtext.textContent=`The total percentage is ${percentage}`
    let parent=document.querySelector('#feedback')
    parent.appendChild(newtext) 
})