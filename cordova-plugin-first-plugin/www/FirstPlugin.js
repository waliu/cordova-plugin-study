var exec = require('cordova/exec');

var FirstPlugin = {
    testFirstPlugin: (arg0, success, error) => {
        exec(success, error, 'FirstPlugin', 'testFirstPlugin', [arg0]);
    }
}
module.exports = FirstPlugin;
