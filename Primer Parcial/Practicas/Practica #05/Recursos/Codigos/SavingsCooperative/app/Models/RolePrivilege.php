<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Builder;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

/**
 * @property mixed id
 * @property mixed role_code
 * @property mixed privilege_id
 * @mixin Builder
 */
class RolePrivilege extends Model
{
    use HasFactory;

    protected $fillable = ['role_code', 'privilege_id'];
}
