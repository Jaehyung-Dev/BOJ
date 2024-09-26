const str = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');
let cnt = 0;
for(let i = 0; i < str.length; i++){
    if(str[i] !== ''){
        cnt++;
    }
}
console.log(cnt);