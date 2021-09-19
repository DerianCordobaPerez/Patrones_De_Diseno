@extends('layouts.app')

@section('content')

    @if (count($roles) > 0)
        <div class="container">
            <table class="table table-dark table-striped shadow p-3 mb-5 bg-body rounded">
                <thead>
                <tr>
                    <th scope="col"><h3>Informacion</h3> </th>
                    <th scope="col"><h3>Acciones</h3> </th>
                </tr>
                </thead>

                <tbody>
                @foreach($roles as $key => $role)
                    <tr>
                        <td>
                            <b>Nombre rol:</b> {{$role->role_name}}<br>
                            <b>Cantidad de privilegios:</b> {{$role->privileges->count()}}<br>
                        </td>

                        <td>
                            <div class="btn-group mx-auto" role="group" aria-label="derian">

                                <a href="{{route('roles.edit', $role->role_code)}}" class="btn btn-warning text-white mx-2">Editar</a>

                                <form action="{{route('roles.destroy', $role->role_code)}}" method="POST">
                                    @csrf @method('DELETE')
                                    <button type="submit" class="btn btn-danger" name="send">Eliminar</button>
                                </form>
                            </div>
                        </td>
                    </tr>
                @endforeach
                </tbody>
            </table>
        </div>
    @else
        <div class="bg-dark p-4 rounded shadow p-3 mb-5">
            <h3 class="text-white">No se han agregado datos a la relación</h3>
        </div>
    @endif

@endsection
