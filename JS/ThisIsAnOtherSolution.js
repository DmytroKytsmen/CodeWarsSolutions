class OnceNamedOne {
    constructor(first, last) {
        this.first = first;
        this.last = last;
    }

    get fullName() {
        return `${this.first} ${this.last}`;
    }


    get firstName() {
        return this.first;
    }

    get lastName() {
        return this.last;
    }


}