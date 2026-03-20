# 
# University management system. 
This is a basic project from the 6th class of the 6th module. We create a basic university management system. 

In this project, I won't focus on best practices but rather in implementing and following the class. I won't use DDD, my model layer will have both DTOs and entities, my entities will be used in the service for operations and there will be mapped as well. The only kind of good practice I'll apply (besides the classic "SOLID" and DRY) will be mapping directly in my controller and passing entities directly to the service; hard decision taking into account my controller will know about my model. 

I'll do bidirectional relationships, even though it would be easier and faster to build unidirectional. 