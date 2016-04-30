function findEmployeesRole(name) {
    var res = employees.filter(function(item){  return item.firstName+' '+item.lastName==name });
    return  res.length ? res[0].role : "Does not work here!";
}