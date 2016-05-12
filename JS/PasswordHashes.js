var crypto = require('crypto');
function passHash(str) {
    var hash = crypto.createHash('md5');
    hash.update(str, 'utf8');
    return hash.digest().toString('hex');
}