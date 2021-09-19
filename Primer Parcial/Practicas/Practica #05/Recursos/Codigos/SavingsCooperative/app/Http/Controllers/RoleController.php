<?php

namespace App\Http\Controllers;

use App\Models\Privileges;
use App\Models\Role;
use App\Models\RolePrivilege;
use Illuminate\Database\Eloquent\Collection;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;
use Illuminate\View\View;

/**
 * Class RoleController
 * @package App\Http\Controllers
 */
class RoleController extends Controller
{

    /**
     * Show to list roles
     *
     * @return View
     */
    public function index(): View
    {
        return view('roles.index')->with('roles', (new Role())->all());
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return View
     */
    public function create(): View
    {
        return view('roles.createEdit')
            ->with('roles', (new Role())->all())
            ->with('privileges', $this->get_all_privileges());
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param Request $request
     * @return RedirectResponse
     */
    public function store(Request $request): RedirectResponse
    {
        $request->validate([
            'role_name' => 'required'
        ]);

        $role = (new Role())->create([
            'role_name' => $request->role_name ?? ''
        ]);

        foreach ($request->input('privileges') as $privilege_id) {
            (new RolePrivilege())->create([
                'role_code' => $role->role_code,
                'privilege_id' => $privilege_id
            ]);
        }

        return redirect()->route('home')->with('success', 'Rol creado correctamente');
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param Role $role
     * @return View
     */
    public function edit(Role $role): View
    {
        return view('roles.createEdit')
            ->with('role', $role)
            ->with('privileges', $this->get_all_privileges());
    }

    /**
     * Update the specified resource in storage.
     *
     * @param Request $request
     * @param Role $role
     * @return RedirectResponse
     */
    public function update(Request $request, Role $role): RedirectResponse
    {
        $role->update($request->all());
        return redirect()->route('roles.index')
            ->with('success', 'Rol actualizado correctamente')
            ->with('roles', (new Role())->all());
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param Role $role
     * @return RedirectResponse
     */
    public function destroy(Role $role): RedirectResponse
    {
        $role->delete();
        return redirect()->route('roles.index')
            ->with('success', 'Rol eliminado correctamente')
            ->with('roles', (new Role())->all());
    }

    private function get_all_privileges(): Collection|array
    {
        return (Privileges::all())->chunk(ceil(Privileges::all()->count() / 2));
    }
}
