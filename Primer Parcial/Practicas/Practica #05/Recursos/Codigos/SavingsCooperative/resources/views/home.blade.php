@extends('layouts.app')

@php
    $buttons = array('Crear roles', 'Editar roles', 'Crear Usuario', 'Editar Usuario');
    $routes = array('', '', '', '');
    $icons = array('fas fa-list-alt', 'fas fa-pencil-alt', 'fas fa-user-plus', 'fas fa-user-edit');
@endphp

@section('content')
    <div class="rounded shadow bg-dark p-4 my-4">
        <h2 class="text-center text-white"><u>Sección de Registro y Modificación</u></h2>
    </div>

    <div class="rounded shadow bg-dark p-4 my-4">
        <h2 class="text-white text-center">Acciones para administrador</h2>

        <div class="row">
            @for($i = 0; $i < count($buttons); ++$i)
                <div class="col-md-3 my-4">
                    <div class="card">
                        <div class="card-header">
                            <h3 class="text-center text-bold">{{$buttons[$i]}}</h3>
                        </div>

                        <div class="card-footer">
                            <div class="d-grid gap-2">
                                <a class="btn btn-primary text-white" href="{{$routes[$i]}}"><i class="{{$icons[$i]}}"></i> {{$buttons[$i]}}</a>
                            </div>
                        </div>
                    </div>
                </div>
            @endfor
        </div>

    </div>

@endsection
