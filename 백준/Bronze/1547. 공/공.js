const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const M = +input[0];

let ball = 1;

for(let i = 1; i <= M; i++) {
  let [start, end] = input[i].split(" ").map(el => +el);
  
  if(start === ball) {
    ball = end;
  } else if(end === ball) {
    ball = start;
  }
}

console.log(ball);