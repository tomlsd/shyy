function getSelected(){
    var row = $('#tt').datagrid('getSelected');
    if (row){
        alert('Item ID:'+row.itemid+"\nPrice:"+row.listprice);
    }
}
function getSelections(){
    var ids = [];
    var rows = $('#tt').datagrid('getSelections');
    for(var i=0; i<rows.length; i++){
        ids.push(rows[i].itemid);
    }
    alert(ids.join('\n'));
}