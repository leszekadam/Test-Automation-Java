var x = w.serviceGetElementByName(serviceGetElementByName("chkAbhFeldWerteAlt", false).value, false);
var y = serviceGetElementByName("multiSelectControl.selectedValuesMarked", false);


if (testfunktion (x, y) == false) {..}


function testfunktion (a, b) { // a = x, b =y
if (a.length == undefined) {
        for (i=0;i<b.length;i++) {
        if (a.value == b.options[i].value) {
        return true;
        }
        }
        return false;
        } else {
        for (ai = 0; ai < a.length; ++ai) {
        var found = false;
        var ni = 0;
        while (ni < b.length && found == false) {
        if (a[ai].value == b.options[ni].value) {
        found = true;
        }
        ni++;
        }
        if (found == false) {
        return false;
        }
        }
        return true;
        }
        }
