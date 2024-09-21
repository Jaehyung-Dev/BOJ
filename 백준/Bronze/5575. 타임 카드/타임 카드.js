const [A, B, C] = require('fs').readFileSync('/dev/stdin').toString().split('\n');
let condition;

for(let i = 0; i < 3; i++){
  if(i === 0) {
    condition = A;
  } else if(i === 1){
    condition = B;
  } else {
    condition = C;
  }

  const timeArray = condition.split(' ').map(el => +el);
  const [HourS, MinuteS, SecondS] = timeArray.slice(0, 3);
  const [HourE, MinuteE, SecondE] = timeArray.slice(3);
  
  const time = (HourE * 3600 + MinuteE * 60 + SecondE) - (HourS * 3600 + MinuteS * 60 + SecondS);
  const result = `${Math.floor(time / 3600)} ${Math.floor((time % 3600) / 60)} ${Math.floor(time % 60)}`;
  
  console.log(result);
}
