const funs = {
    answerChecker: function(group,trueAnswers){
        let result = 0;
       
        for (let i = 0; i < group.length; i++) {
            for(let j = 0; j< group[i].length; j++){
                if(group[i][j].checked && group[i][j].id===trueAnswers[i].idTrue)
                    result++;
            }
            
       }
       return result;
    },
    generateResBlock: function (countTrue,countMax,btnRes){
        const btnRestart = document.createElement("input");
        btnRestart.type = "button";
        btnRestart.value = "Перепройти";
        btnRestart.addEventListener("click",function(){location.reload()})
    
        const resultMes = document.createElement("div");
        if(countTrue===countMax){
            resultMes.style.border  = "solid 5px #8CEC8A"
            resultMes.style.backgroundColor = "#2EA91A";
        }
        else{
            resultMes.style.border  = "solid 5px #FD8F8F"
            resultMes.style.backgroundColor = "#ED3333";
        }
        resultMes.style.fontWeight = "bold";
        resultMes.style.padding = "1%";
        resultMes.textContent = `Всего верных ответов ${countTrue} из ${countMax}`;
        
        
        btnRes.after(resultMes);    
        resultMes.after(btnRestart);   
    
        btnRes.setAttribute("disabled","");
    }
}

export const answerChecker = funs.answerChecker;
export const generateResBlock = funs.generateResBlock; 
   