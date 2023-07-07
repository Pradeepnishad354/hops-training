let myJokes=[
    {
        "category": "Programming",
        "type": "twopart",
        "setup": "Why did the functional programmer get thrown out of school?",
        "delivery": "Because he refused to take classes.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 48,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "I'd tell you a joke about NAT but I would have to translate.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "safe": true,
        "id": 319,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "A SQL statement walks into a bar and sees two tables.\nIt approaches, and asks \"may I join you?\"",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 5,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "There are only 10 kinds of people in this world: those who know binary and those who don't.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 35,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "ASCII silly question, get a silly ANSI.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 25,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "Your momma is so fat, you need to switch to NTFS to store a picture of her.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": true
        },
        "id": 55,
        "safe": false,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "Knock knock.\nWho's there?\nRecursion.\nRecursion who?\nKnock knock.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 180,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "twopart",
        "setup": "So what's a set of predefined steps the government might take to preserve the environment?",
        "delivery": "An Al-Gore-ithm.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 52,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "twopart",
        "setup": "why do python programmers wear glasses?",
        "delivery": "Because they can't C.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "safe": true,
        "id": 294,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "single",
        "joke": "Your mama's so FAT she can't save files bigger than 4GB.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": true
        },
        "id": 9,
        "safe": false,
        "lang": "en"
    },
    {
        "category": "Pun",
        "type": "twopart",
        "setup": "So I made a graph of all my past relationships.",
        "delivery": "It has an ex axis and a why axis.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "id": 80,
        "safe": true,
        "lang": "en"
    },
    {
        "category": "Programming",
        "type": "twopart",
        "setup": "Programming is like sex.",
        "delivery": "Make one mistake and you end up supporting it for the rest of your life.",
        "flags": {
            "nsfw": true,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": true
        },
        "id": 8,
        "safe": false,
        "lang": "en"
    },
    {
        "category": "Christmas",
        "type": "twopart",
        "setup": "Whats the Grinchs least favorite band?",
        "delivery": "The Who.",
        "flags": {
            "nsfw": false,
            "religious": false,
            "political": false,
            "racist": false,
            "sexist": false,
            "explicit": false
        },
        "safe": true,
        "id": 293,
        "lang": "en"
    }
]

function submit(){
let random=Math.floor(Math.random() * ( myJokes.length-1));
console.log(random)

// let r=(Math.random() * ( myJokes.length-1));

// console.log(random)

let j=document.getElementById("joke")
j.innerHTML=myJokes[random].joke;


}







