var result = document.querySelector('#result');
var buttons = document.querySelectorAll('button');
var equal=document.querySelector('#equal');

equal.addEventListener("click", () => {
    result.value=eval(result.value); 
  });
  
buttons.forEach(btn=>{
  btn.addEventListener("click", () => {
    result.value += btn.value;
  });
});
buttons[0].addEventListener("click",()=>{
    console.log("Hi");
})

document.querySelector('#clear').addEventListener('click', () => {
  result.value = '';
});