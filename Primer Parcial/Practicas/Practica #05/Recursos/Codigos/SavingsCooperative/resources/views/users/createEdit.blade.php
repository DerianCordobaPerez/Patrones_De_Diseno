@extends('layouts.app')
@section('content')

<div class="row align-items-center justify-content-center text-center text-white">
    <div class="col-md-6 ">
        <div class="px-4 py-3 formulario">
            <!-- creacion de usuario y asignacion de roles-->
            <form action="" class="px-3">

                <!--Nombre y  identificacion (input text)-->
                <div class=" form-input input-group my-2 col">
                    <span class="input-group-text">Nombre</span>
                    <input type="text" class="form-control col-md-6" name="name" placeholder="" value="{{$employee->name ?? ''}}" required>
                </div>
                <div class="form-input input-group my-2">
                    <span class="input-group-text">Identificacion</span>
                    <input type="text" class="form-control col-md-6" name="indentification" placeholder="" value="{{$employee->identification ?? ''}}" required>
                </div>

                <!--Sexo (radio button)-->
                <fieldset class="row mb-3">
                    <legend class="col-form-label col-sm-2 pt-0">Sexo</legend>
                    <div class="col-sm-10">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="sex" value="" checked>
                            <label class="form-check-label">
                                Masculino
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="sex" value="">
                            <label class="form-check-label">
                                Femenino
                            </label>
                        </div>
                    </div>
                </fieldset>
                <!-- ss -->

                <!--Estado civil (radio button)-->
                <div class="row">
                    <div class="col">
                        <label>Estado Civil</label>
                    </div>
                    <div class="col">
                        <input type="radio" name="marital_status" value="">
                        <label>Soltero</label>&nbsp;&nbsp;
                        <input type="radio" name="marital_status" value="">
                        <label>Casado</label>&nbsp;&nbsp;
                        <input type="radio" name="marital_status" value="">
                        <label>Relacion Libre</label>&nbsp;&nbsp;
                    </div>
                </div>

                <!--Email-->
                <div class="form-input input-group my-2">
                    <span class="input-group-text">Mail Personal</span>
                    <input type="email" class="form-control col-md-6" name="personal_mail" placeholder="" value="{{$employee->personal_mail ?? ''}}" required>
                </div>
                <div class="form-input input-group my-2">
                    <span class="input-group-text">Mail Interno</span>
                    <input type="email" class="form-control col-md-6" name="internal_mail" placeholder="" value="{{$employee->internal_mail ?? ''}}" required>
                </div>

                <!--Clave-->
                <div class="form-input input-group my-2">
                    <span class="input-group-text">Clave</span>
                    <input type="password" class="form-control col-md-6" name="password" placeholder="" value="" required>
                </div>

                <!--Profesion-->
                <div class="form-input input-group my-2">
                    <span class="input-group-text">Profesion</span>
                    <input type="text" class="form-control col-md-6" name="" placeholder="profession" value="{{$employee->profession ?? ''}}" required>
                </div>

                <!--Fecha-->
                <div class="row">
                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Fecha de Nacimiento</span>
                        <input type="date" class="form-control col-md-6" name="date_of_birth" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Nacionalidad</span>
                        <select name="nacionality">
                            <option>Nicaraguense</option>
                            <option>Aleman</option>
                            <option>Estado Unidense</option>
                        </select>
                    </div>
                </div>

                <div class="row">
                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Fecha de Ingreso</span>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Fecha de Salida</span>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>
                </div>

                <div class="form-input input-group my-2">
                    <span class="input-group-text">Rol</span>
                    <select name="rol">
                        <option>Trabajador</option>
                        <option>Jefe</option>
                        <option>Secretario</option>
                    </select>
                </div>

                <div class="row">
                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Fecha Inicio Rol</span>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>

                    <div class="form-input input-group my-2 col">
                        <span class="input-group-text">Fecha Salida Rol</span>
                        <input type="date" class="form-control col-md-6" name="" placeholder="" value="" required>
                    </div>
                </div>

                <button type="submit" name="send" class="btn btn-success">Registrar</button>
                <a href="http://" class="btn btn-warning">Cancelar</a>
            </form>
        </div>
    </div>
</div>
@endsection