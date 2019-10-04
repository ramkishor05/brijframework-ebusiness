USE [OrderingSystem]
GO

INSERT INTO [dbo].[UserTypes]
           ([UserTypeID]
           ,[IsActive]
           ,[UserTypeName])
     VALUES
           (1
           ,1
           ,'ADMIN')
INSERT INTO [dbo].[UserTypes]
           ([UserTypeID]
           ,[IsActive]
           ,[UserTypeName])
     VALUES
           (2
           ,1
           ,'EMPLOYEE')
INSERT INTO [dbo].[UserTypes]
           ([UserTypeID]
           ,[IsActive]
           ,[UserTypeName])
     VALUES
           (3
           ,1
           ,'DELIVERY')
INSERT INTO [dbo].[UserTypes]
           ([UserTypeID]
           ,[IsActive]
           ,[UserTypeName])
     VALUES
           (4
           ,1
           ,'CUSTOMER')
GO