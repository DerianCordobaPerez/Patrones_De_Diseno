<?php

namespace App\Http\Controllers;

use App\Models\UserRole;
use Illuminate\Http\RedirectResponse;
use Illuminate\Http\Request;
use Illuminate\View\View;

class UserRoleController extends Controller
{
    /**
     * Show the form for creating a new resource.
     *
     * @return View
     */
    public function create(): View
    {
        return view('users.createEdit')->with('userRole');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param Request $request
     * @return RedirectResponse
     */
    public function store(Request $request): RedirectResponse
    {
        return redirect()->route('');
    }

    /**
     * Display the specified resource.
     *
     * @param UserRole $userRole
     * @return View
     */
    public function show(UserRole $userRole): View
    {
        return view('users.show')->with('userRole', $userRole);
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param UserRole $userRole
     * @return View
     */
    public function edit(UserRole $userRole): View
    {
        return view('users.createEdit')->with('userRole', $userRole);
    }

    /**
     * Update the specified resource in storage.
     *
     * @param Request $request
     * @param UserRole $userRole
     * @return RedirectResponse
     */
    public function update(Request $request, UserRole $userRole): RedirectResponse
    {
        return redirect()->route('');
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param UserRole $userRole
     * @return RedirectResponse
     */
    public function destroy(UserRole $userRole): RedirectResponse
    {
        return redirect()->route('');
    }
}
