var childProcess = require('child_process');
function execute(command, callback) {
    childProcess.exec(command, function (error, data) {
        error === null ? callback(null, data) : callback(error);
    });
}