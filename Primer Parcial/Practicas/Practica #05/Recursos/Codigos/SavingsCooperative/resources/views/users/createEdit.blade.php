@extends('layouts.app')
@section('content')

    <div class="row d-flex align-items-center justify-content-center text-center">
        <div class="col-md-6 ">
            <div class="card px-5 py-5 formulario">
                <!-- creacion de usuario y asignacion de roles-->
                <form action="">

                    <!--Nombre y  identificacion (input text)-->
                    <div class="form-input input-group my-2">
                        <label>Nombre</label>
                        <input type="text" class="form-control col-md-6" name="name" placeholder="" value="{{$employee->name ?? ''}}" required>
                    </div>
                    <div class="form-input input-group my-2">
                        <label>Identificacion</label>
                        <input type="text" class="form-control col-md-6" name="indentification" placeholder="" value="{{$employee->identification ?? ''}}" required>
                    </div>

                    <!--Sexo (radio button)-->
                    <div class="form-input input-group my-2">
                        <label>Sexo</label>
                        <input type="radio" name="sex" value="">
                        <label>Masculino</label>
                        <input type="radio" name="sex" value="">
                        <label>Femenino</label>
                    </div>

                    <!--Estado civil (radio button)-->
                    <div class="form-input input-group my-2">
                        <label>Estado Civil</label>
                        <input type="radio" name="marital_status" value="">
                        <label>Soltero</label>
                        <input type="radio" name="marital_status" value="">
                        <label>Casado</label>
                        <input type="radio" name="marital_status" value="">
                        <label>Relacion Libre</label>
                    </div>

                    <!--Email-->
                    <div class="form-input input-group my-2">
                        <label>Email Personal</label>
                        <input type="email" class="form-control col-md-6" name="personal_mail" placeholder="" value="{{$employee->personal_mail ?? ''}}" required>
                    </div>
                    <div class="form-input input-group my-2">
                        <label>Email Interno</label>
                        <input type="email" class="form-control col-md-6" name="internal_mail" placeholder="" value="{{$employee->internal_mail ?? ''}}" required>
                    </div>

                    <!--Clave-->
                    <div class="form-input input-group my-2">
                        <label>Clave</label>
                        <input type="password" class="form-control col-md-6" name="password" placeholder="" value="" required>
                    </div>

                    <!--Profesion-->
                    <div class="form-input input-group my-2">
                        <label>Profesion</label>
                        <input type="text" class="form-control col-md-6" name="" placeholder="profession" value="{{$employee->profession ?? ''}}" required>
                    </div>

                    <!--Fecha-->
                    <div class="input-group">
                        <label>Fecha de Nacimiento</label>
                        <input type="date" class="form-control col-md-6" name="date_of_birth" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Nacionalidad</label>
                        <select name="nacionality">
                <option>Nicaraguense</option>
                <option>Aleman</option>
                <option>Estado Unidense</option>    
                </select>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Fecha de Ingreso</label>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Fecha de Salida</label>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Roles</label>
                        <select name="rol">
                <option>Trabajador</option>
                <option>Jefe</option>
                <option>Secretario</option>    
                </select>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Fecha de Inicio del rol</label>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2">
                        <label>Fecha de Salida del rol</label>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <button type="submit" name="send" class="btn btn-success">Registrar</button>
                    <a href="http://" class="btn btn-warning">Cancelar</a>
                </form>
            </div>
        </div>
    </div>
@endsection