class NamedOne {
    constructor(first, last) {
        this.first = first;
        this.last = last;

    }

    set firstName(name) {
        this.first = name;

    }

    get firstName() {
        return this.first;
    }

    get lastName() {
        return this.last;
    }

    get fullName() {
        return `${this.first} ${this.last}`;
    }

    set fullName(newValue) {
        if (newValue.split(' ').length == 2) {
            [this.first, this.last] = newValue.split(' ');
        }
        else {
            return;
        }
    }

    set lastName(name) {
        this.last = name;

    }

}
