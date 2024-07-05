let arrayBingo = [['01', '02', '03', '04', '05', '06', '07', '08', '09', 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75], []];
let count = 0;
function crialista(){
    if(arrayBingo[0].length != 0){
        count++;
        let indiceAleatorio = Math.floor(Math.random() * arrayBingo[0].length);

        let numeroQueCaiu = arrayBingo[0][indiceAleatorio];

        arrayBingo[1].push(arrayBingo[0][indiceAleatorio])
        arrayBingo[0].splice(indiceAleatorio, 1)[0];

        const lista_bingo = document.getElementById('Lista-bingo');
        const lista_bingo_todos = document.getElementById('Lista-bingo-todos');
        lista_bingo.innerHTML = '';
        lista_bingo_todos.innerHTML = '';
        const h1Numero = document.getElementById('Numero');
        const countT = document.getElementById('count');
        const ulTodos = document.createElement('ul');
        const ulB = document.createElement('ul');
        const ulI = document.createElement('ul');
        const ulN = document.createElement('ul');
        const ulG = document.createElement('ul');
        const ulO = document.createElement('ul');

        countT.innerHTML ='Quantidade de pedras que já caíram: '+ count;

        let li = document.createElement('h1');
        li.textContent = 'B';
        ulB.appendChild(li);
        lista_bingo_todos.appendChild(ulB);

        li = document.createElement('h1');
        li.textContent = 'I';
        ulI.appendChild(li);
        lista_bingo_todos.appendChild(ulI);

        li = document.createElement('h1');
        li.textContent = 'N';
        ulN.appendChild(li);
        lista_bingo_todos.appendChild(ulN);

        li = document.createElement('h1');
        li.textContent = 'G';
        ulG.appendChild(li);
        lista_bingo_todos.appendChild(ulG);

        li = document.createElement('h1');
        li.textContent = 'O';
        ulO.appendChild(li);
        lista_bingo_todos.appendChild(ulO);


        if(numeroQueCaiu>=1 && numeroQueCaiu<=15){   
            h1Numero.innerHTML = 'Pedra: B- ' + numeroQueCaiu;
        }
        if(numeroQueCaiu>=16 && numeroQueCaiu<=30){
            h1Numero.innerHTML = 'Pedra: I- ' + numeroQueCaiu;
        }
        if(numeroQueCaiu>=31 && numeroQueCaiu<=45){
            h1Numero.innerHTML = 'Pedra: N- ' + numeroQueCaiu;
        }
        if(numeroQueCaiu>=46 && numeroQueCaiu<=60){
            h1Numero.innerHTML = 'Pedra: G- ' + numeroQueCaiu;
        }
        if(numeroQueCaiu>=61 && numeroQueCaiu<=75){
            h1Numero.innerHTML = 'Pedra: O- ' + numeroQueCaiu;
        }
        
        let ultimos5 = arrayBingo[1].slice(-5);
        ultimos5.forEach(element => {

            const li = document.createElement('li');
            if(element>=1 && element<=15){   
                li.textContent = '| B- ' + element;
            }
            if(element>=16 && element<=30){
                li.textContent = '| I- ' + element;
            }
            if(element>=31 && element<=45){
                li.textContent = '| N- ' + element;
            }
            if(element>=46 && element<=60){
                li.textContent = '| G- ' + element;
            }
            if(element>=61 && element<=75){
                li.textContent = '| O- ' + element;
            }
            ulTodos.appendChild(li);
            lista_bingo_todos.appendChild(ulTodos);
            
        });

        arrayBingo[1].forEach(element => {
            const li = document.createElement('li');
            if(element>=1 && element<=15){  
                li.textContent = 'B- ' + element;
                ulB.appendChild(li);  
            }
            if(element>=16 && element<=30){
                li.textContent = 'I- ' + element;
                ulI.appendChild(li);   
            }
            if(element>=31 && element<=45){
                li.textContent = 'N- ' + element;
                ulN.appendChild(li);   
            }
            if(element>=46 && element<=60){
                li.textContent = 'G- ' + element;
                ulG.appendChild(li);
                
            }
            if(element>=61 && element<=75){
                li.textContent = 'O- ' + element;
                ulO.appendChild(li);
            }
            
        });
        lista_bingo.appendChild(ulB);
        lista_bingo.appendChild(ulI);
        lista_bingo.appendChild(ulN);
        lista_bingo.appendChild(ulG);
        lista_bingo.appendChild(ulO);
    }else{
        alert("Foram todas as pedras!!")
    }
}

function recomecar(){
    const lista_bingo = document.getElementById('Lista-bingo');
    const lista_bingo_todos = document.getElementById('Lista-bingo-todos');
    const h1Numero = document.getElementById('Numero');
    lista_bingo.innerHTML = '';
    lista_bingo_todos.innerHTML = '';
    h1Numero.innerHTML = ' ';
    arrayBingo = [['01', '02', '03', '04', '05', '06', '07', '08', '09', 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75], []];
    count = 0;
    const countT = document.getElementById('count');
    countT.innerHTML ='Quantidade de pedras que já caíram: '+ count;
}

