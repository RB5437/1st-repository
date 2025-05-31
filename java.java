AMI: ami-0554aa6767e249943
InstancesType: t2.micro
Key: Key_Aws
NetworkSettings
Security Group
SGID: sg-04430f5d7b1973a87

aws ec2 run-instances --image-id ami-0554aa6767e249943--instance-type t2.micro  --key-name Key_Aws --security-group-ids  sg-04430f5d7b1973a87
    
    
