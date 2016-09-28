
function valueFormator(options, value) {
	if(options && options.length>0){
		for(var i=0; i<options.length; i++){
			if (options[i].id == value ){
				return options[i].value;
			} 
			
		}
	}
	
	return value;
}

function valueFormatorExt(options, value) {
	var ret="-";
	if (value && value!='' && options && options.length>0) {
		for(var i=0; i<options.length; i++){
			if (options[i].id == value ){
				ret = options[i].value;
				break;
			} 
		}
	}
	
	return ret;
}
function valueFormatorExt1(value) {
	var ret="-";
	if (value && value!='') {
		ret=value;
	}
	
	return ret;
}

function checkedFormator(value, row, index) {
	if (value === 1) {
        return {
            checked: true
        };
    }
	
	return value;
}

function getSelectRow(datas, id) {
	if(datas && datas.length>0){
		for(var i=0; i<datas.length; i++){
			if (datas[i].id == id ){
				return datas[i];
			} 
			
		}
	}
	
	return "";
}



