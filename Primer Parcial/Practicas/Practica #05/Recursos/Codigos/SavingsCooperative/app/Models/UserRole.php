<?php

namespace App\Models;

use DateTime;
use Illuminate\Database\Eloquent\Builder;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;
use Illuminate\Database\Eloquent\Relations\HasOne;

/**
 * @property Integer user_code
 * @property string employee_code
 * @property Integer role_code
 * @property string password
 * @property DateTime start_date
 * @property DateTime final_date
 * @mixin Builder
 */
class UserRole extends Model
{
    use HasFactory;

    protected $fillable = ['employee_code', 'role_code', 'password', 'start_date', 'final_date'];

    public function employees(): HasOne {
        return $this->hasOne(Employee::class);
    }

    public function roles(): BelongsToMany
    {
        return $this->belongsToMany(Role::class);
    }

    protected $hidden =['password'];
}
