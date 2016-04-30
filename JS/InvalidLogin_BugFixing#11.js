function validate(username, password) {
    var wrong1 = '||';
    var wrong2 = '//';

    if (password.indexOf(wrong1) > -1 || password.indexOf(wrong2) > -1) {
        return 'Wrong username or password!';
    }
    var database = new Database();
    return database.login(username, password);


}