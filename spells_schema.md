* spells table
    * spell_name varchar(?) primary_key
    * school varchar(?)
    * subschool varchar(?)
    * **descriptors table**
    * **spell_levels table**
    * casting_time varchar(?)
    * **spell_components table**
    * `range varchar(?)
    * area varchar(?)
    * effect varchar(?)
    * duration varchar(?)
    * dismissable bit
    * shapeable bit
    * **spell_saving_throws table**
    * spell_resistance varchar(?)
    * description text
    * **spell_domains table**

* spell_descriptors table
    * spell_name varchar(?) primary_key
    * descriptor varchar(?) primary_key

* spell_levels table
    * spell_name varchar(?) primary_key
    * class_name varchar(?) primary_key
    * spell_level tinyint

* spell_components table
    * spell_name varchar(?) primary_key
    * spell_component varchar(?) primary_key


   note: may be unnecessary
* spell_saving_throws table
    * spell_name varchar(?) primary_key
    * saving_throw varchar(10) primary_key
    * saving_throw_order tinyint
    * effect varchar(?)

* spell_domains_table
    * spell_name varchar(?) primary_key
    * domain_name varchar(?) primary_key
    * spell_level tinyint