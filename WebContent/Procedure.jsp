<!DOCTYPE html>
<html>
<head>
<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 180px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 180px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
.tab {
    float: left;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
    width: 20%;
    height: 300 px;
}


.tab button {
    display: block;
    background-color: inherit;
    color: black;
    padding: 20px 12px;
    width: 100%;
    border: none;
    outline: none;
    text-align: left;
    cursor: pointer;
    transition: 0.3s;
    font-size: 17px;
}


.tab button:hover {
    background-color: #ddd;
}


.tab button.active {
    background-color: #ccc;
}


.tabcontent {
    float: left;
    padding: 0px 12px;
    border: 1px solid #ccc;
    width: 70%;
    border-left: none;
    height: 300px;
}
</style>
</head>
<body>

<form >

<header>
   <h1>Medications</h1>
</header>
  

  <div class="tab">
  <button><a href="Summary.jsp" style="cursor:pointer">Summary</a></button>
  <button> <a href="Allergies.jsp" style="cursor:pointer">Allergies</a></button>
  <button ><a href="lab_result.jsp" style="cursor:pointer">Lab Results<a/></button>
  <button><a href="Medication.jsp" style="cursor:pointer">Medication</a></button>
  <button><a href="Condition.jsp" style="cursor:pointer">Condition</a></button>
  <button><a href="Procedure.jsp" style="cursor:pointer">Procedure</a></button>
</div>

  <article>

</article>


</form>


</body>
</html>
 