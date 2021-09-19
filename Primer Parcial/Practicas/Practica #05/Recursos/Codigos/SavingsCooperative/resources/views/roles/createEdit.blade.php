@extends('layouts.app')
@section('content')
    <div class="row my-2">
        <div class="col-md-12">
            <h2 class="text-center text-white my-2"><u>{{!isset($role) ? 'Creacion' : 'Edicion'}} de roles</u></h2>

            <div class="card bg-dark rounded shadow text-white col-8 mx-auto p-4">
                <form method="POST" action="{{route('roles.store')}}">
                    @csrf

                    <label class="my-2">
                        Nombre del rol:
                        <input type="text" name="role_name" class="mx-2 rounded">
                    </label>

                    <label class="mx-2">
                        Seleccionar todos los privilegios
                        <input type="checkbox" name="select_all_privileges">
                    </label>

                    <div class="row text-justify">
                        @foreach($privileges as $privilege)
                            <div class="col-md-6">
                                @foreach($privilege as $item)
                                    <div class="row my-4 form-check form-switch">
                                        <label>
                                            {{$item->name}}
                                            <input type="checkbox" name="privileges[]" value="{{$item->id}}" class="form-check-input">
                                        </label>
                                    </div>
                                @endforeach
                            </div>
                        @endforeach
                    </div>

                    <div class="my-2 d-grid gap-2 col-6 mx-auto">
                        <button class="btn btn-primary" type="submit">Guardar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
@endsection
