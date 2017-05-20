### Class related data

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
    * description text
    * level_granted tinyint
    
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