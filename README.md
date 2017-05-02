# pathfinderAPI
Pathfinder webservice for getting information about various game elements and options.

## Queries

* Class information
    * Class name
    * Class skills
    * Hit die
    * Saves
    * BAB progression
    * Archetypes
        * Archetype name
        * Modified class skills

* Feats
* Traits
* Spells
    * School
    * Subschool
    * Descriptors
    * 
    
    
    
## Database Schema

* classes table
    * class_name varchar(?) primary_key
    * description text
    * role text
    * alignment varchar(20)
    * hit_die varchar(5)
    * starting_wealth varchar(20)
    * **class_skills table**
    * base_skill_ranks_per_level tinyint
    * modified_skill_ranks_per_level varchar(30)
    * base_attack_bonus_progression varchar(10)
    * **class_saving_throws table**
    
* class_saving_throws table
    * class_name varchar(?) primary_key
    * save varchar(10) primary_key
    * progression varchar(10)
    * progression_equation varchar(20)
    
* class_features table
    * class_name varchar(?) primary_key
    * feature_name varchar(?) primary_key
    * description
    * level_granted
    
* class_skills table
    * class_name varchar(?) primary key
    * skill_name varchar(?) primary key

* archetypes table
    * archetype_name varchar(?) primary_key
    * class_name varchar(?) primary_key
    * **archetype_skills table**

* archetype_skills table
    * archetype_name varchar(?) primary_key
    * class_name varchar(?) primary_key
    * skill_name varchar(?) primary_key
    
* prestige_classes table
    
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