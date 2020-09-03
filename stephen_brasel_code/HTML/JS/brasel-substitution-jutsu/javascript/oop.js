function Computer(name, ramSizeGb, cpuCores, cpuSpeedGhz){
	this.name = name;
	this.ramSizeGb = ramSizeGb;
	this.cpuCores = cpuCores;
	this.cpuSpeedGhz = cpuSpeedGhz;

	this.printSpecs = function(){
		console.log("This computer is named: " + this.name + ". It has " + this.ramSizeGb)
	}
}

function Computer(name, ramSizeGb, cpuCores, cpuSpeedGhz){
	var obj = {};
	obj.name = name;
	obj.ramSizeGb = ramSizeGb;
	obj.cpuCores = cpuCores;
	obj.cpuSpeedGhz = cpuSpeedGhz;

	obj.printSpecs = function(){
		console.log("This computer is named: " + this.name + ". It has " + this.ramSizeGb)
	}

	return obj;
}