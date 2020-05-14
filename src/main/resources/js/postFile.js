$('#excel-file1').change(function(e) {
    var system=$("#system").val();
    var date=$("#date").val();
    var file1=document.getElementById('excel-file1');
    var filePath = file1.value;
    var fileName = filePath.substring(filePath.lastIndexOf('\\')+1);
    if(system.length ===0 || date.length===0){
        alert("请填写系统和日期");
    }else{
        // alert(fileName);
        var files = e.target.files;
        var fileReader = new FileReader();
        fileReader.onload = function(ev) {
            try {
                var data = ev.target.result;
                var workbook = XLSX.read(data, {
                    type: 'binary'
                }); // 以二进制流方式读取得到整份excel表格对象
                var excelFile = []; // 存储获取到的数据
            } catch (e) {
                console.log('文件类型不正确');
                return;
            }

            // 表格的表格范围，可用于判断表头是否数量是否正确
            var fromTo = '';
            // 遍历每张表读取
            for (var sheet in workbook.Sheets) {
                if (workbook.Sheets.hasOwnProperty(sheet)) {
                    fromTo = workbook.Sheets[sheet]['!ref'];
                    console.log(fromTo);
                    excelFile = excelFile.concat(XLSX.utils.sheet_to_json(workbook.Sheets[sheet]));
                    var s="";
                    // for(var i=0;i<excelFile.length;i++){
                    //     s="<tr>";
                    //     for(var key in excelFile[i]){
                    //         s=s+"<td>"+excelFile[i][key]+"</td>";
                    //     }
                    //     s+="</tr>";
                    //     $("#tab").append(s);
                    // }
                    break; // 如果只取第一张表，就取消注释这行
                }
            }
            $.ajax({
                url:"/getExcel",
                //data:JSON.stringify(excelFile),
                data:JSON.stringify({excelFile:excelFile,system:system,fileName:fileName,date:date}),
                method:"post",
                contentType:"application/json",
                dataType:"json",
                traditional: true,
            });
            //在控制台打印出来表格中的数据
            console.log(excelFile);
            alert("success!");
        };
        // 以二进制方式打开文件
        fileReader.readAsBinaryString(files[0]);
    }
});
function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}
function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}
$('#date').datebox({

});
function stop() {
    alert("aa");
    window.location.href="http://www.baidu.com";
}