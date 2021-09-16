@extends('layouts.app')
@section('content')
<body>
    <div class="row d-flex align-items-center justify-content-center text-center">
        <div class="col-md-6 ">
            <div class="card px-5 py-5 formulario">
                <!-- creacion de roles-->
                <form name="crear_roles">
                    <h2>Creacion de roles</h2><br> Nombre del rol: <input type="text" name="name">
                    <br><br> Seleccionar: <select id="selectA" name="selectA" onchange="selectAll();">
                        <option value="value1">Todos</option>
                        <option value="value2" selected>Normal</option>
                      </select>
                    <br>
                    <div class="row">
                        <div class="col">
                            <input type="checkbox" name=""> Creacion y Mantenimiento de Usuario
                            <br>
                            <input type="checkbox" name=""> Creacion y Mantenimiento de Roles
                            <br>
                            <input type="checkbox" name=""> Control de caja
                            <br>
                            <input type="checkbox" name=""> Control de boveda
                            <br>
                            <input type="checkbox" name=""> Autorizar/Negar transacciones
                            <br>
                            <input type="checkbox" name=""> Control de cierre de cajas
                        </div>
                        <div class="col">
                            <input type="checkbox" name=""> Movimientos de Boveda
                            <br>
                            <input type="checkbox" name=""> Apertura de Cuentas
                            <br>
                            <input type="checkbox" name=""> Creacion y Mantenimiento de socios
                            <br>
                            <input type="checkbox" name=""> Creacion de Cuentas Bancarias
                            <br>
                            <input type="checkbox" name=""> Realizacion de tranferencia
                            <br>
                            <input type="checkbox" name=""> Manejo de cheques y otros documentos
                        </div>
                    </div>
                    <button type="submit">Guardar</button>
                </form>

            </div>
        </div>
    </div>
</body>
<script>
    function selectAll() {
        var cod = document.getElementById("selectA").value;
        if (cod == "value1") {
            for (i = 0; i < document.crear_roles.elements.length; i++)
                if (document.crear_roles.elements[i].type == "checkbox")
                    document.crear_roles.elements[i].checked = 1
        } else {
            for (i = 0; i < document.crear_roles.elements.length; i++)
                if (document.crear_roles.elements[i].type == "checkbox")
                    document.crear_roles.elements[i].checked = 0
        }
    }
</script>
@endsection
