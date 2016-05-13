class Game {
    constructor(name, level) {
        this.player = new Player(name);
        this.level = parseInt(level) || 0;
        this.floors = [];

    }
}

class Player {
    constructor(name) {
        if (typeof name === "string" && name.length > 0) {
            this.name = name;
        }
        else {
            this.name = "Player";
        }
        this.health = 100.00;
        this.position = {
            x: 0,
            y: 0
        };
        this.damage = 10.00;
        this.luck = 1.00;
    }
}

class Monster {
    constructor(level) {
        this.level = parseInt(level);
    }
}

class Map {
    constructor(level) {
        this.level = parseInt(level);
    }
}