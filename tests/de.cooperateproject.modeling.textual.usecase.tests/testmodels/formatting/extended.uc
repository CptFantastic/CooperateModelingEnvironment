@start-ucd "diagram11"

rootElement RootElement

# abstract actor[human] "AbstractHumanUser" as hu
# abstract actor[machine] "AbstractMachineUser" as mu
+ actor HumanUser1
+ actor MachineUser1

sys System1 {
	uc UseCase1 {
		ep uc1extender
	}

	uc UseCase2
	uc UseCase3
}

isa (HumanUser1,RootElement.hu)
isa (MachineUser1,RootElement.mu)
inc (UseCase2,UseCase3)
ext (UseCase2, UseCase1) ep[uc1extender] cond["Examplery extension condition"]
iac (HumanUser1, System1.UseCase1)
iac (HumanUser1, System1.UseCase3)
iac (MachineUser1, UseCase2)

@end-ucd